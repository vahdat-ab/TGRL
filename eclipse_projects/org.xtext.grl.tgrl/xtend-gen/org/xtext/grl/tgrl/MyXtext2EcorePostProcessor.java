package org.xtext.grl.tgrl;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.GeneratedMetamodel;
import org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor;

@SuppressWarnings("all")
public class MyXtext2EcorePostProcessor implements IXtext2EcorePostProcessor {
  public void process(final GeneratedMetamodel metamodel) {
    EPackage _ePackage = metamodel.getEPackage();
    this.process(_ePackage);
  }
  
  public void process(final EPackage p) {
    EList<EClassifier> _eClassifiers = p.getEClassifiers();
    Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
    for (final EClass c : _filter) {
      String _name = c.getName();
      boolean _equals = Objects.equal(_name, "Element");
      if (_equals) {
        this.handle(c);
      }
    }
  }
  
  public boolean handle(final EClass c) {
    boolean _xblockexpression = false;
    {
      final EAttribute at = EcoreFactory.eINSTANCE.createEAttribute();
      at.setName("id");
      EDataType _eInt = EcorePackage.eINSTANCE.getEInt();
      at.setEType(_eInt);
      EList<EStructuralFeature> _eStructuralFeatures = c.getEStructuralFeatures();
      _xblockexpression = _eStructuralFeatures.add(at);
    }
    return _xblockexpression;
  }
}
