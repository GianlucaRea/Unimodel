/**
 * generated by Xtext 2.25.0
 */
package it.univaq.disim.unimodel.xtext.formatting2;

import com.google.inject.Inject;
import it.univaq.disim.unimodel.h4model.Address;
import it.univaq.disim.unimodel.h4model.Building;
import it.univaq.disim.unimodel.h4model.Floor;
import it.univaq.disim.unimodel.h4model.Library;
import it.univaq.disim.unimodel.h4model.University;
import it.univaq.disim.unimodel.xtext.services.UnimodelGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class UnimodelFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private UnimodelGrammarAccess _unimodelGrammarAccess;
  
  protected void _format(final University university, @Extension final IFormattableDocument document) {
    EList<Building> _buildings = university.getBuildings();
    for (final Building building : _buildings) {
      document.<Building>format(building);
    }
  }
  
  protected void _format(final Building building, @Extension final IFormattableDocument document) {
    document.<Address>format(building.getAddress());
    document.<Library>format(building.getLibrary());
    EList<Floor> _floors = building.getFloors();
    for (final Floor floor : _floors) {
      document.<Floor>format(floor);
    }
  }
  
  public void format(final Object building, final IFormattableDocument document) {
    if (building instanceof XtextResource) {
      _format((XtextResource)building, document);
      return;
    } else if (building instanceof Building) {
      _format((Building)building, document);
      return;
    } else if (building instanceof University) {
      _format((University)building, document);
      return;
    } else if (building instanceof EObject) {
      _format((EObject)building, document);
      return;
    } else if (building == null) {
      _format((Void)null, document);
      return;
    } else if (building != null) {
      _format(building, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(building, document).toString());
    }
  }
}
