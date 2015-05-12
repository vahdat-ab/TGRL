package org.eclipse.acceleo.module.tgrl.java.services;

import java.util.ArrayList;
import java.util.List;

import org.xtext.grl.tgrl.tGRL.Actor;
import org.xtext.grl.tgrl.tGRL.ElementLink;
import org.xtext.grl.tgrl.tGRL.EvaluationStrategy;
import org.xtext.grl.tgrl.tGRL.GRLElement;
import org.xtext.grl.tgrl.tGRL.GRLSpecification;
import org.xtext.grl.tgrl.tGRL.Model;
import org.xtext.grl.tgrl.tGRL.NormalDecomposition;
import org.xtext.grl.tgrl.tGRL.QualitativeMapping;
import org.xtext.grl.tgrl.tGRL.SuperIntentionalElement;

public class ModelFeatures {
	public List<SuperIntentionalElement> getAllSuperIntentionalElements(Model inModel)	{
		List<SuperIntentionalElement> output = new ArrayList<SuperIntentionalElement>();
		for (GRLSpecification grlspec : inModel.getGRLspecifications()) {
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

		}		
		return output;
	}
	public List<ElementLink> getAllElementLink(Model inModel)	{
		List<ElementLink> output = new ArrayList<ElementLink>();
		for (GRLSpecification grlspec : inModel.getGRLspecifications()) {
			for (GRLElement grlElement1 : grlspec.getGrlElements()) {
				if (grlElement1 instanceof ElementLink) {
					output.add((ElementLink)grlElement1);	
				} else if (grlElement1 instanceof Actor){
						for (GRLElement grlElement2 : ((Actor)grlElement1).getElemets()) {
							if (grlElement2 instanceof ElementLink) {
								output.add((ElementLink)grlElement2);	
							}
						}
				}
			}

		}		
		return output;
	}
	public List<NormalDecomposition> getAllNormalDecompositions(Model inModel){
		List<NormalDecomposition> output = new ArrayList<NormalDecomposition>();
		for (GRLSpecification grlspec : inModel.getGRLspecifications()) {
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
		}
		return output;
	}	
	
	public List<QualitativeMapping> getAllQualitativeMappings(Model inModel){
		List<QualitativeMapping> output = new ArrayList<QualitativeMapping>();
		for (GRLSpecification grlspec : inModel.getGRLspecifications()) {
			for (GRLElement grlElement1 : grlspec.getGrlElements()) {
				if (grlElement1 instanceof QualitativeMapping) {
					output.add((QualitativeMapping)grlElement1);
				} 
			}		
		}
		return output;
	}
	
	public List<EvaluationStrategy> getAllParentStrategis(Model inModel,EvaluationStrategy inEvaluationStrategy){
		List<EvaluationStrategy> output = new ArrayList<EvaluationStrategy>();
		for (GRLSpecification grlspec : inModel.getGRLspecifications()) {
			for (GRLElement grlElement1 : grlspec.getGrlElements()) {
				if (grlElement1 instanceof EvaluationStrategy) {
					for (EvaluationStrategy evaluationStrategy : ((EvaluationStrategy)grlElement1).getSuperStrategies()) {
						if (evaluationStrategy.equals(inEvaluationStrategy)){
							output.add((EvaluationStrategy)grlElement1);
						}
					}
				} 
			}		
		}
		return output;
	}
	
//	public List<Connection> getAllConnections(Model inModel){
//		List<Connection> output = new ArrayList<Connection>();
//		for (ElementLink elementLink : getAllElementLink(inModel)) {
//			if (elementLink instanceof DecompositionLink){
//				for (Connection connection : ((DecompositionLink)elementLink).getConnections()) {
//					output.add(connection);
//				}
//			}
//			else if (elementLink instanceof ContributionLink){
//				for (Connection connection : ((ContributionLink)elementLink).getConnections()) {
//					output.add(connection);
//				}
//			}
//			else if (elementLink instanceof DependencyLink){
//				for (Connection connection : ((DependencyLink)elementLink).getConnections()) {
//					output.add(connection);
//				}
//			}
//				
//		}
//		return output;
//	}
}
