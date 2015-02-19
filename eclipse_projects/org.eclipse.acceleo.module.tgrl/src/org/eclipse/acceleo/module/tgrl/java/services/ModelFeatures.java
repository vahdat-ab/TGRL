package org.eclipse.acceleo.module.tgrl.java.services;

import java.util.ArrayList;
import java.util.List;

import org.xtext.grl.tgrl.tGRL.Actor;
import org.xtext.grl.tgrl.tGRL.ElementLink;
import org.xtext.grl.tgrl.tGRL.GRLspec;
import org.xtext.grl.tgrl.tGRL.IntentionalElement;
import org.xtext.grl.tgrl.tGRL.Model;

public class ModelFeatures {
	public List<IntentionalElement> getAllIntentionalElements(Model inModel)	{
		List<IntentionalElement> in = new ArrayList<IntentionalElement>();
		for (GRLspec grlspec : inModel.getGRLspecs()) {
			for (IntentionalElement intentionalElement : grlspec.getIntElements()) {
				in.add(intentionalElement);
			}
			for (Actor actor : grlspec.getActors()) {
				for (IntentionalElement intentionalElement : actor.getIntentionalElements()) {
					in.add(intentionalElement);
				}
			}
		}		
		return in;
	}
	public List<ElementLink> getAllElementLink(Model inModel)	{
		List<ElementLink> in = new ArrayList<ElementLink>();
		for (GRLspec grlspec : inModel.getGRLspecs()) {
			for (ElementLink elementLink : grlspec.getLinks()) {
				in.add(elementLink);
			}
			for (Actor actor : grlspec.getActors()) {
				for (ElementLink elementLink : actor.getElementLinks()) {
					in.add(elementLink);
				}
			}
		}		
		return in;
	}
}
