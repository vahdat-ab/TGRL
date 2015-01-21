/**
 */
package core.util;

import core.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
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
			case CorePackage.CORE_MODEL: {
				COREModel coreModel = (COREModel)theEObject;
				T result = caseCOREModel(coreModel);
				if (result == null) result = caseCORENamedElement(coreModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORE_IMPACT_MODEL: {
				COREImpactModel coreImpactModel = (COREImpactModel)theEObject;
				T result = caseCOREImpactModel(coreImpactModel);
				if (result == null) result = caseCOREModel(coreImpactModel);
				if (result == null) result = caseCORENamedElement(coreImpactModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORE_CONCERN: {
				COREConcern coreConcern = (COREConcern)theEObject;
				T result = caseCOREConcern(coreConcern);
				if (result == null) result = caseCORENamedElement(coreConcern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORE_FEATURE: {
				COREFeature coreFeature = (COREFeature)theEObject;
				T result = caseCOREFeature(coreFeature);
				if (result == null) result = caseCOREModelElement(coreFeature);
				if (result == null) result = caseCORENamedElement(coreFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORE_BINDING: {
				COREBinding coreBinding = (COREBinding)theEObject;
				T result = caseCOREBinding(coreBinding);
				if (result == null) result = caseCORECompositionSpecification(coreBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORE_MODEL_ELEMENT: {
				COREModelElement coreModelElement = (COREModelElement)theEObject;
				T result = caseCOREModelElement(coreModelElement);
				if (result == null) result = caseCORENamedElement(coreModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORE_COMPOSITION_SPECIFICATION: {
				CORECompositionSpecification coreCompositionSpecification = (CORECompositionSpecification)theEObject;
				T result = caseCORECompositionSpecification(coreCompositionSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORE_MAPPING: {
				COREMapping coreMapping = (COREMapping)theEObject;
				T result = caseCOREMapping(coreMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORE_NAMED_ELEMENT: {
				CORENamedElement coreNamedElement = (CORENamedElement)theEObject;
				T result = caseCORENamedElement(coreNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORE_INTERFACE: {
				COREInterface coreInterface = (COREInterface)theEObject;
				T result = caseCOREInterface(coreInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORE_REUSE: {
				COREReuse coreReuse = (COREReuse)theEObject;
				T result = caseCOREReuse(coreReuse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORE_PATTERN: {
				COREPattern corePattern = (COREPattern)theEObject;
				T result = caseCOREPattern(corePattern);
				if (result == null) result = caseCORECompositionSpecification(corePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORE_IMPACT_MODEL_ELEMENT: {
				COREImpactModelElement coreImpactModelElement = (COREImpactModelElement)theEObject;
				T result = caseCOREImpactModelElement(coreImpactModelElement);
				if (result == null) result = caseCOREModelElement(coreImpactModelElement);
				if (result == null) result = caseCORENamedElement(coreImpactModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORE_CONFIGURATION: {
				COREConfiguration coreConfiguration = (COREConfiguration)theEObject;
				T result = caseCOREConfiguration(coreConfiguration);
				if (result == null) result = caseCORENamedElement(coreConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORE_FEATURE_MODEL: {
				COREFeatureModel coreFeatureModel = (COREFeatureModel)theEObject;
				T result = caseCOREFeatureModel(coreFeatureModel);
				if (result == null) result = caseCOREModel(coreFeatureModel);
				if (result == null) result = caseCORENamedElement(coreFeatureModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORE_MODEL_REUSE: {
				COREModelReuse coreModelReuse = (COREModelReuse)theEObject;
				T result = caseCOREModelReuse(coreModelReuse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORE Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORE Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOREModel(COREModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORE Impact Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORE Impact Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOREImpactModel(COREImpactModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORE Concern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORE Concern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOREConcern(COREConcern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORE Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORE Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOREFeature(COREFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORE Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORE Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOREBinding(COREBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORE Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORE Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOREModelElement(COREModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORE Composition Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORE Composition Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCORECompositionSpecification(CORECompositionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORE Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORE Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOREMapping(COREMapping object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>CORE Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORE Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOREInterface(COREInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORE Reuse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORE Reuse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOREReuse(COREReuse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORE Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORE Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOREPattern(COREPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORE Impact Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORE Impact Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOREImpactModelElement(COREImpactModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORE Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORE Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOREConfiguration(COREConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORE Feature Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORE Feature Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOREFeatureModel(COREFeatureModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORE Model Reuse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORE Model Reuse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOREModelReuse(COREModelReuse object) {
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

} //CoreSwitch
