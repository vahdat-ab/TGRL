/*
 * generated by Xtext
 */
package org.xtext.grl.tgrl;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.DefaultEcoreElementFactory;
import org.eclipse.xtext.parser.IAstFactory;
import org.xtext.grl.tgrl.tGRL.DecompositionEnd;
import org.xtext.grl.tgrl.tGRL.Element;
import org.xtext.grl.tgrl.tGRL.EndLink;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class TGRLRuntimeModule extends org.xtext.grl.tgrl.AbstractTGRLRuntimeModule {
	@Override
	public Class<? extends IAstFactory> bindIAstFactory() {
		// TODO Auto-generated method stub
		return TGRLAstFactory.class;
	}
	static public class TGRLAstFactory extends DefaultEcoreElementFactory {
		private static int id = 20;

		@Override
		public void set(EObject object, String feature, Object value,
				String ruleName, INode node) throws ValueConverterException {
			// TODO Auto-generated method stub

			super.set(object, feature, value, ruleName, node);
			if (object instanceof Element) {
				
				Element element = (Element) object;    
					element.setId(id);
					id++;
			} else if (object instanceof EndLink){
				EndLink element1 = (EndLink) object;        
				element1.setId(id);
				id++;
			}
		}	
	}

}
