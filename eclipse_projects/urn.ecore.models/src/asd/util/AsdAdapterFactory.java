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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import urncore.IURNDiagram;
import urncore.URNmodelElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see asd.AsdPackage
 * @generated
 */
public class AsdAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AsdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AsdPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsdSwitch<Adapter> modelSwitch =
		new AsdSwitch<Adapter>() {
			@Override
			public Adapter caseASDspec(ASDspec object) {
				return createASDspecAdapter();
			}
			@Override
			public Adapter caseASDelement(ASDelement object) {
				return createASDelementAdapter();
			}
			@Override
			public Adapter caseASDiagram(ASDiagram object) {
				return createASDiagramAdapter();
			}
			@Override
			public Adapter caseMediatingElement(MediatingElement object) {
				return createMediatingElementAdapter();
			}
			@Override
			public Adapter caseMediation(Mediation object) {
				return createMediationAdapter();
			}
			@Override
			public Adapter caseMediatedElement(MediatedElement object) {
				return createMediatedElementAdapter();
			}
			@Override
			public Adapter caseASDmodelElement(ASDmodelElement object) {
				return createASDmodelElementAdapter();
			}
			@Override
			public Adapter caseASNetwork(ASNetwork object) {
				return createASNetworkAdapter();
			}
			@Override
			public Adapter caseASDlayout(ASDlayout object) {
				return createASDlayoutAdapter();
			}
			@Override
			public Adapter caseTool(Tool object) {
				return createToolAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseDivisionOfLabour(DivisionOfLabour object) {
				return createDivisionOfLabourAdapter();
			}
			@Override
			public Adapter caseCommunity(Community object) {
				return createCommunityAdapter();
			}
			@Override
			public Adapter caseSubject(Subject object) {
				return createSubjectAdapter();
			}
			@Override
			public Adapter caseObject(asd.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseMotivation(Motivation object) {
				return createMotivationAdapter();
			}
			@Override
			public Adapter caseOutcome(Outcome object) {
				return createOutcomeAdapter();
			}
			@Override
			public Adapter caseCORENamedElement(CORENamedElement object) {
				return createCORENamedElementAdapter();
			}
			@Override
			public Adapter caseURNmodelElement(URNmodelElement object) {
				return createURNmodelElementAdapter();
			}
			@Override
			public Adapter caseIURNDiagram(IURNDiagram object) {
				return createIURNDiagramAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link asd.ASDspec <em>AS Dspec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asd.ASDspec
	 * @generated
	 */
	public Adapter createASDspecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asd.ASDelement <em>AS Delement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asd.ASDelement
	 * @generated
	 */
	public Adapter createASDelementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asd.ASDiagram <em>AS Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asd.ASDiagram
	 * @generated
	 */
	public Adapter createASDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asd.MediatingElement <em>Mediating Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asd.MediatingElement
	 * @generated
	 */
	public Adapter createMediatingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asd.Mediation <em>Mediation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asd.Mediation
	 * @generated
	 */
	public Adapter createMediationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asd.MediatedElement <em>Mediated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asd.MediatedElement
	 * @generated
	 */
	public Adapter createMediatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asd.ASDmodelElement <em>AS Dmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asd.ASDmodelElement
	 * @generated
	 */
	public Adapter createASDmodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asd.ASNetwork <em>AS Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asd.ASNetwork
	 * @generated
	 */
	public Adapter createASNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asd.ASDlayout <em>AS Dlayout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asd.ASDlayout
	 * @generated
	 */
	public Adapter createASDlayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asd.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asd.Tool
	 * @generated
	 */
	public Adapter createToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asd.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asd.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asd.DivisionOfLabour <em>Division Of Labour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asd.DivisionOfLabour
	 * @generated
	 */
	public Adapter createDivisionOfLabourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asd.Community <em>Community</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asd.Community
	 * @generated
	 */
	public Adapter createCommunityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asd.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asd.Subject
	 * @generated
	 */
	public Adapter createSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asd.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asd.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asd.Motivation <em>Motivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asd.Motivation
	 * @generated
	 */
	public Adapter createMotivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asd.Outcome <em>Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asd.Outcome
	 * @generated
	 */
	public Adapter createOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.CORENamedElement <em>CORE Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.CORENamedElement
	 * @generated
	 */
	public Adapter createCORENamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urncore.URNmodelElement <em>UR Nmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urncore.URNmodelElement
	 * @generated
	 */
	public Adapter createURNmodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urncore.IURNDiagram <em>IURN Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urncore.IURNDiagram
	 * @generated
	 */
	public Adapter createIURNDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AsdAdapterFactory
