package org.xtext.grl.tgrl;

import org.eclipse.xtext.GeneratedMetamodel;
import org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor;

import org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor
import org.eclipse.xtext.GeneratedMetamodel
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.EcorePackage.Literals
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.common.util.BasicEMap$Entry
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl
 
class MyXtext2EcorePostProcessor implements IXtext2EcorePostProcessor {
     
    override void process(GeneratedMetamodel metamodel) {
        metamodel.EPackage.process
    }
     
    def process(EPackage p) {
        for (c : p.EClassifiers.filter(typeof(EClass))) {
            if (c.name == "GRLModelElement") {
                c.handle
            }
        }
    }
     
    def handle (EClass c) {
        val at = EcoreFactory::eINSTANCE.createEAttribute
        at.name = "id"
        at.EType = EcorePackage::eINSTANCE.EInt
        c.getEStructuralFeatures().add(at);
//        c.EAttributes+=at;
    }
     
}