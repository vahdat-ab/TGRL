package org.eclipse.acceleo.module.tgrl.java.services;


import java.util.ArrayList;
import java.util.List;

import org.xtext.grl.tgrl.tGRL.Actor;
import org.xtext.grl.tgrl.tGRL.ContributionEnd;
import org.xtext.grl.tgrl.tGRL.DecompositionEnd;
import org.xtext.grl.tgrl.tGRL.DependencyEnd;
import org.xtext.grl.tgrl.tGRL.ElementLink;
import org.xtext.grl.tgrl.tGRL.EvaluationStrategy;
import org.xtext.grl.tgrl.tGRL.GRLElement;
import org.xtext.grl.tgrl.tGRL.GRLSpecification;
import org.xtext.grl.tgrl.tGRL.InLineContribution;
import org.xtext.grl.tgrl.tGRL.InLineDecomposition;
import org.xtext.grl.tgrl.tGRL.InLineDependency;
import org.xtext.grl.tgrl.tGRL.InLineElementLink;
import org.xtext.grl.tgrl.tGRL.InLineLink;
import org.xtext.grl.tgrl.tGRL.IntentionalElement;
import org.xtext.grl.tgrl.tGRL.Model;
import org.xtext.grl.tgrl.tGRL.NormalContribution;
import org.xtext.grl.tgrl.tGRL.NormalDecomposition;
import org.xtext.grl.tgrl.tGRL.NormalDependency;
import org.xtext.grl.tgrl.tGRL.NormalElementLink;
import org.xtext.grl.tgrl.tGRL.NormalLink;
import org.xtext.grl.tgrl.tGRL.QualitativeMapping;
import org.xtext.grl.tgrl.tGRL.SuperIntentionalElement;
import org.xtext.grl.tgrl.tGRL.TGRLFactory;


public class ModelFeatures {
	public List<SuperIntentionalElement> getAllSuperIntentionalElements(GRLSpecification grlspec,Model inModel)	{
		List<SuperIntentionalElement> output = new ArrayList<SuperIntentionalElement>();
//		for (GRLSpecification grlspec : inModel.getGRLspecifications()) {
			for (GRLElement grlElement1 : grlspec.getGrlElements()) {
				if (grlElement1 instanceof SuperIntentionalElement) {
					output.add((SuperIntentionalElement)grlElement1);	
				} else if (grlElement1 instanceof Actor){
						for (GRLElement grlElement2 : ((Actor)grlElement1).getElemets()) {
							if (grlElement2 instanceof SuperIntentionalElement) {
								output.add((SuperIntentionalElement)grlElement2);	
							}
						}
				}
			}

//		}		
		return output;
	}

	public List<NormalDecomposition> getAllNormalDecompositions(GRLSpecification grlspec,Model inModel){
		List<NormalDecomposition> output = new ArrayList<NormalDecomposition>();
//		for (GRLSpecification grlspec : inModel.getGRLspecifications()) {
			for (GRLElement grlElement1 : grlspec.getGrlElements()) {
				if (grlElement1 instanceof NormalDecomposition) {
					output.add((NormalDecomposition)grlElement1);
				} 
			    else if (grlElement1 instanceof Actor){
						for (GRLElement grlElement2 : ((Actor)grlElement1).getElemets()) {
							if (grlElement2 instanceof NormalDecomposition) {
								output.add((NormalDecomposition)grlElement2);	
							}
						}
				}
			}		
//		}
		return output;
	}	
	
	public List<QualitativeMapping> getAllQualitativeMappings(GRLSpecification grlspec,Model inModel){
		List<QualitativeMapping> output = new ArrayList<QualitativeMapping>();
//		for (GRLSpecification grlspec : inModel.getGRLspecifications()) {
			for (GRLElement grlElement1 : grlspec.getGrlElements()) {
				if (grlElement1 instanceof QualitativeMapping) {
					output.add((QualitativeMapping)grlElement1);
				} 
			}		
//		}
		return output;
	}
	
	public List<EvaluationStrategy> getAllParentStrategis(GRLSpecification grlspec,Model inModel,EvaluationStrategy inEvaluationStrategy){
		List<EvaluationStrategy> output = new ArrayList<EvaluationStrategy>();
//		for (GRLSpecification grlspec : inModel.getGRLspecifications()) {
			for (GRLElement grlElement1 : grlspec.getGrlElements()) {
				if (grlElement1 instanceof EvaluationStrategy) {
					for (EvaluationStrategy evaluationStrategy : ((EvaluationStrategy)grlElement1).getSuperStrategies()) {
						if (evaluationStrategy.equals(inEvaluationStrategy)){
							output.add((EvaluationStrategy)grlElement1);
						}
					}
				} 
			}		
//		}
		return output;
	}

	public List<ElementLink> getAllElementLinksFromIntentionalElement(IntentionalElement inIntentionalElement){
		List<ElementLink> output = new ArrayList<ElementLink>();	
		for(InLineElementLink inLineElement:inIntentionalElement.getElementLinks()){
			if(inLineElement instanceof InLineDecomposition){
				NormalDecomposition newElement = TGRLFactory.eINSTANCE.createNormalDecomposition();
				newElement.setSrc(inIntentionalElement);
				newElement.getDest().addAll(((InLineDecomposition) inLineElement).getDest());
				output.add(newElement);
			} else if(inLineElement instanceof InLineDependency){
				NormalDependency newElement = TGRLFactory.eINSTANCE.createNormalDependency();
				newElement.setSrc(inIntentionalElement);
				newElement.getDest().addAll(((InLineDependency) inLineElement).getDest());
				output.add(newElement);
			} else if(inLineElement instanceof InLineContribution){
				NormalContribution newElement = TGRLFactory.eINSTANCE.createNormalContribution();
				newElement.setSrc(inIntentionalElement);
				newElement.getDest().addAll(((InLineContribution) inLineElement).getDest());
				output.add(newElement);
			} else if(inLineElement instanceof InLineLink){
				NormalLink newElement = TGRLFactory.eINSTANCE.createNormalLink();
				newElement.setSrc(inIntentionalElement);
				newElement.getDest().addAll(((InLineLink) inLineElement).getDest());
				output.add(newElement);
			}
		}
		return output;
	}

	public List<ElementLink> getAllElementLinks(GRLSpecification grlspec,Model inModel){
		List<ElementLink> output = new ArrayList<ElementLink>();
//		for (GRLSpecification grlspec : inModel.getGRLspecifications()) {
			for (GRLElement grlElement1 : grlspec.getGrlElements()) {
				if(grlElement1 instanceof ElementLink){
					output.add((ElementLink)grlElement1);
				}
				else if(grlElement1 instanceof IntentionalElement){
					output.addAll(getAllElementLinksFromIntentionalElement((IntentionalElement)grlElement1));
				} 
				else if (grlElement1 instanceof Actor){
					for(GRLElement grlElement : ((Actor)grlElement1).getElemets()){
						if (grlElement instanceof IntentionalElement){
							output.addAll(getAllElementLinksFromIntentionalElement((IntentionalElement)grlElement));
						} else if (grlElement instanceof NormalElementLink){
							output.add((ElementLink)grlElement);
						}
					}
				}
			}		
//		}
		int index=0;
		for(ElementLink eLink : output){
			if(eLink instanceof NormalDecomposition){
				for(DecompositionEnd dEnd: ((NormalDecomposition)eLink).getDest()){
					dEnd.setId(index);
					index++;
				}
			} else if(eLink instanceof NormalDependency){
				for(DependencyEnd dEnd: ((NormalDependency)eLink).getDest()){
					dEnd.setId(index);
					index++;
				}
			} else if(eLink instanceof NormalContribution){
				for(ContributionEnd dEnd: ((NormalContribution)eLink).getDest()){
					dEnd.setId(index);
					index++;
				}
			} else if(eLink instanceof NormalLink){
				for(GRLElement dEnd: ((NormalLink)eLink).getDest()){
					dEnd.setId(index);
					index++;
				}
			}			
		}
	return output;
}	
	
	public SuperIntentionalElement findSuperIntentionalElement(GRLSpecification grlspec,Model inModel,SuperIntentionalElement inSuperIntentionalElement) {
		
//		for (GRLSpecification grlspec : inModel.getGRLspecifications()) {
			for (GRLElement grlElement1 : grlspec.getGrlElements()) {
				if(grlElement1 instanceof SuperIntentionalElement){
					if (grlElement1.equals(inSuperIntentionalElement)) return (SuperIntentionalElement)grlElement1;
				}
				else if (grlElement1 instanceof Actor){
					for (GRLElement grlElement2 : ((Actor)grlElement1).getElemets()   ) {
						if (grlElement2 instanceof SuperIntentionalElement){
							if (grlElement2.equals(inSuperIntentionalElement)) return (SuperIntentionalElement)grlElement2;
						}
					}
				}

			}		
//		}
		return null;
		
	}
}
