/**
 */
package ucm.scenario.util;

import core.CORENamedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ucm.scenario.*;

import urncore.UCMmodelElement;
import urncore.URNmodelElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ucm.scenario.ScenarioPackage
 * @generated
 */
public class ScenarioAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScenarioPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScenarioPackage.eINSTANCE;
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
	protected ScenarioSwitch<Adapter> modelSwitch =
		new ScenarioSwitch<Adapter>() {
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseScenarioDef(ScenarioDef object) {
				return createScenarioDefAdapter();
			}
			@Override
			public Adapter caseScenarioGroup(ScenarioGroup object) {
				return createScenarioGroupAdapter();
			}
			@Override
			public Adapter caseEnumerationType(EnumerationType object) {
				return createEnumerationTypeAdapter();
			}
			@Override
			public Adapter caseInitialization(Initialization object) {
				return createInitializationAdapter();
			}
			@Override
			public Adapter caseScenarioStartPoint(ScenarioStartPoint object) {
				return createScenarioStartPointAdapter();
			}
			@Override
			public Adapter caseScenarioEndPoint(ScenarioEndPoint object) {
				return createScenarioEndPointAdapter();
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
			public Adapter caseUCMmodelElement(UCMmodelElement object) {
				return createUCMmodelElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link ucm.scenario.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.scenario.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.scenario.ScenarioDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.scenario.ScenarioDef
	 * @generated
	 */
	public Adapter createScenarioDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.scenario.ScenarioGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.scenario.ScenarioGroup
	 * @generated
	 */
	public Adapter createScenarioGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.scenario.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.scenario.EnumerationType
	 * @generated
	 */
	public Adapter createEnumerationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.scenario.Initialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.scenario.Initialization
	 * @generated
	 */
	public Adapter createInitializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.scenario.ScenarioStartPoint <em>Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.scenario.ScenarioStartPoint
	 * @generated
	 */
	public Adapter createScenarioStartPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucm.scenario.ScenarioEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucm.scenario.ScenarioEndPoint
	 * @generated
	 */
	public Adapter createScenarioEndPointAdapter() {
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
	 * Creates a new adapter for an object of class '{@link urncore.UCMmodelElement <em>UC Mmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urncore.UCMmodelElement
	 * @generated
	 */
	public Adapter createUCMmodelElementAdapter() {
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

} //ScenarioAdapterFactory
