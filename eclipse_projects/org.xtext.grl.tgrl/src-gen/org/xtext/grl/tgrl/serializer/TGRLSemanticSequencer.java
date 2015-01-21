package org.xtext.grl.tgrl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import grl.Actor;
import grl.ElementLink;
import grl.GRLspec;
import grl.GrlPackage;
import grl.ImpactModel;
import grl.IntentionalElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.xtext.grl.tgrl.services.TGRLGrammarAccess;
import urn.URNspec;
import urn.UrnPackage;

@SuppressWarnings("all")
public class TGRLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TGRLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GrlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GrlPackage.ACTOR:
				if(context == grammarAccess.getActorRule()) {
					sequence_Actor(context, (Actor) semanticObject); 
					return; 
				}
				else break;
			case GrlPackage.ELEMENT_LINK:
				if(context == grammarAccess.getElementLinkRule()) {
					sequence_ElementLink(context, (ElementLink) semanticObject); 
					return; 
				}
				else break;
			case GrlPackage.GR_LSPEC:
				if(context == grammarAccess.getGRLspecRule()) {
					sequence_GRLspec(context, (GRLspec) semanticObject); 
					return; 
				}
				else break;
			case GrlPackage.IMPACT_MODEL:
				if(context == grammarAccess.getImpactModelRule()) {
					sequence_ImpactModel(context, (ImpactModel) semanticObject); 
					return; 
				}
				else break;
			case GrlPackage.INTENTIONAL_ELEMENT:
				if(context == grammarAccess.getIntentionalElementRule()) {
					sequence_IntentionalElement(context, (IntentionalElement) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == UrnPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UrnPackage.UR_NSPEC:
				if(context == grammarAccess.getURNspecRule()) {
					sequence_URNspec(context, (URNspec) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Actor(EObject context, Actor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ElementLink(EObject context, ElementLink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (links+=ElementLink* actors+=Actor* intElements+=IntentionalElement* impactModel=ImpactModel?)
	 */
	protected void sequence_GRLspec(EObject context, GRLspec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ImpactModel(EObject context, ImpactModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_IntentionalElement(EObject context, IntentionalElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID urndef=URNdefinition asdspec=ASDspec grlspec=GRLspec)
	 */
	protected void sequence_URNspec(EObject context, URNspec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
