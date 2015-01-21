/**
 */
package core.util;

import core.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
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
	protected CoreSwitch<Adapter> modelSwitch =
		new CoreSwitch<Adapter>() {
			@Override
			public Adapter caseCOREModel(COREModel object) {
				return createCOREModelAdapter();
			}
			@Override
			public Adapter caseCOREImpactModel(COREImpactModel object) {
				return createCOREImpactModelAdapter();
			}
			@Override
			public Adapter caseCOREConcern(COREConcern object) {
				return createCOREConcernAdapter();
			}
			@Override
			public Adapter caseCOREFeature(COREFeature object) {
				return createCOREFeatureAdapter();
			}
			@Override
			public Adapter caseCOREBinding(COREBinding object) {
				return createCOREBindingAdapter();
			}
			@Override
			public Adapter caseCOREModelElement(COREModelElement object) {
				return createCOREModelElementAdapter();
			}
			@Override
			public Adapter caseCORECompositionSpecification(CORECompositionSpecification object) {
				return createCORECompositionSpecificationAdapter();
			}
			@Override
			public Adapter caseCOREMapping(COREMapping object) {
				return createCOREMappingAdapter();
			}
			@Override
			public Adapter caseCORENamedElement(CORENamedElement object) {
				return createCORENamedElementAdapter();
			}
			@Override
			public Adapter caseCOREInterface(COREInterface object) {
				return createCOREInterfaceAdapter();
			}
			@Override
			public Adapter caseCOREReuse(COREReuse object) {
				return createCOREReuseAdapter();
			}
			@Override
			public Adapter caseCOREPattern(COREPattern object) {
				return createCOREPatternAdapter();
			}
			@Override
			public Adapter caseCOREImpactModelElement(COREImpactModelElement object) {
				return createCOREImpactModelElementAdapter();
			}
			@Override
			public Adapter caseCOREConfiguration(COREConfiguration object) {
				return createCOREConfigurationAdapter();
			}
			@Override
			public Adapter caseCOREFeatureModel(COREFeatureModel object) {
				return createCOREFeatureModelAdapter();
			}
			@Override
			public Adapter caseCOREModelReuse(COREModelReuse object) {
				return createCOREModelReuseAdapter();
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
	 * Creates a new adapter for an object of class '{@link core.COREModel <em>CORE Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.COREModel
	 * @generated
	 */
	public Adapter createCOREModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.COREImpactModel <em>CORE Impact Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.COREImpactModel
	 * @generated
	 */
	public Adapter createCOREImpactModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.COREConcern <em>CORE Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.COREConcern
	 * @generated
	 */
	public Adapter createCOREConcernAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.COREFeature <em>CORE Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.COREFeature
	 * @generated
	 */
	public Adapter createCOREFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.COREBinding <em>CORE Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.COREBinding
	 * @generated
	 */
	public Adapter createCOREBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.COREModelElement <em>CORE Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.COREModelElement
	 * @generated
	 */
	public Adapter createCOREModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.CORECompositionSpecification <em>CORE Composition Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.CORECompositionSpecification
	 * @generated
	 */
	public Adapter createCORECompositionSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.COREMapping <em>CORE Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.COREMapping
	 * @generated
	 */
	public Adapter createCOREMappingAdapter() {
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
	 * Creates a new adapter for an object of class '{@link core.COREInterface <em>CORE Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.COREInterface
	 * @generated
	 */
	public Adapter createCOREInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.COREReuse <em>CORE Reuse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.COREReuse
	 * @generated
	 */
	public Adapter createCOREReuseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.COREPattern <em>CORE Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.COREPattern
	 * @generated
	 */
	public Adapter createCOREPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.COREImpactModelElement <em>CORE Impact Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.COREImpactModelElement
	 * @generated
	 */
	public Adapter createCOREImpactModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.COREConfiguration <em>CORE Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.COREConfiguration
	 * @generated
	 */
	public Adapter createCOREConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.COREFeatureModel <em>CORE Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.COREFeatureModel
	 * @generated
	 */
	public Adapter createCOREFeatureModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link core.COREModelReuse <em>CORE Model Reuse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see core.COREModelReuse
	 * @generated
	 */
	public Adapter createCOREModelReuseAdapter() {
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

} //CoreAdapterFactory
