package org.eclipse.acceleo.module.tgrl.java.services;

import java.util.ArrayList;
import java.util.List;

import org.xtext.grl.tgrl.tGRL.Actor;
import org.xtext.grl.tgrl.tGRL.Connection;
import org.xtext.grl.tgrl.tGRL.ContributionLink;
import org.xtext.grl.tgrl.tGRL.DecompositionLink;
import org.xtext.grl.tgrl.tGRL.DependencyLink;
import org.xtext.grl.tgrl.tGRL.ElementLink;
import org.xtext.grl.tgrl.tGRL.GRLElement;
import org.xtext.grl.tgrl.tGRL.GRLSpecification;
import org.xtext.grl.tgrl.tGRL.IntentionalElement;
import org.xtext.grl.tgrl.tGRL.Model;

public class ModelFeatures {
	public List<IntentionalElement> getAllIntentionalElements(Model inModel)	{
		List<IntentionalElement> output = new ArrayList<IntentionalElement>();
		for (GRLSpecification grlspec : inModel.getGRLspecs()) {
			for (GRLElement grlElement1 : grlspec.getGrlElements()) {
				if (grlElement1 instanceof IntentionalElement) {
					output.add((IntentionalElement)grlElement1);	
				} else if (grlElement1 instanceof Actor){
						for (GRLElement grlElement2 : ((Actor)grlElement1).getElemets()) {
							if (grlElement2 instanceof IntentionalElement) {
								output.add((IntentionalElement)grlElement2);	
							}
						}
				}
			}

		}		
		return output;
	}
	public List<ElementLink> getAllElementLink(Model inModel)	{
		List<ElementLink> output = new ArrayList<ElementLink>();
		for (GRLSpecification grlspec : inModel.getGRLspecs()) {
			for (GRLElement grlElement1 : grlspec.getGrlElements()) {
				if (grlElement1 instanceof ElementLink) {
					output.add((ElementLink)grlElement1);	
				} else if (grlElement1 instanceof Actor){
						for (GRLElement grlElement2 : ((Actor)grlElement1).getElemets()) {
							if (grlElement2 instanceof IntentionalElement) {
								output.add((ElementLink)grlElement2);	
							}
						}
				}
			}

		}		
		return output;
	}
	public List<Connection> getAllConnections(Model inModel){
		List<Connection> output = new ArrayList<Connection>();
		for (ElementLink elementLink : getAllElementLink(inModel)) {
			if (elementLink instanceof DecompositionLink){
				for (Connection connection : ((DecompositionLink)elementLink).getConnections()) {
					output.add(connection);
				}
			}
			else if (elementLink instanceof ContributionLink){
				for (Connection connection : ((ContributionLink)elementLink).getConnections()) {
					output.add(connection);
				}
			}
			else if (elementLink instanceof DependencyLink){
				for (Connection connection : ((DependencyLink)elementLink).getConnections()) {
					output.add(connection);
				}
			}
				
		}
		return output;
	}
}
