package unimodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Address;
  private ConceptPresentation props_Book;
  private ConceptPresentation props_Building;
  private ConceptPresentation props_Class;
  private ConceptPresentation props_Floor;
  private ConceptPresentation props_Library;
  private ConceptPresentation props_Loans;
  private ConceptPresentation props_Office;
  private ConceptPresentation props_Person;
  private ConceptPresentation props_Room;
  private ConceptPresentation props_University;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Address:
        if (props_Address == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This concept describe the address of the building");
          cpb.rawPresentation("Address");
          props_Address = cpb.create();
        }
        return props_Address;
      case LanguageConceptSwitch.Book:
        if (props_Book == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This concept describe a book that can be found in the library");
          cpb.presentationByName();
          props_Book = cpb.create();
        }
        return props_Book;
      case LanguageConceptSwitch.Building:
        if (props_Building == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This concept describe a building of a University");
          cpb.presentationByName();
          props_Building = cpb.create();
        }
        return props_Building;
      case LanguageConceptSwitch.Class:
        if (props_Class == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This concept describe a classroom");
          cpb.presentationByName();
          props_Class = cpb.create();
        }
        return props_Class;
      case LanguageConceptSwitch.Floor:
        if (props_Floor == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This concept describe the floor of the building");
          cpb.rawPresentation("Floor");
          props_Floor = cpb.create();
        }
        return props_Floor;
      case LanguageConceptSwitch.Library:
        if (props_Library == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This concept descibe the library in a university building ");
          cpb.presentationByName();
          props_Library = cpb.create();
        }
        return props_Library;
      case LanguageConceptSwitch.Loans:
        if (props_Loans == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This concept describe the loans of a book");
          cpb.rawPresentation("Loans");
          props_Loans = cpb.create();
        }
        return props_Loans;
      case LanguageConceptSwitch.Office:
        if (props_Office == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This concept describe a office in the university");
          cpb.presentationByName();
          props_Office = cpb.create();
        }
        return props_Office;
      case LanguageConceptSwitch.Person:
        if (props_Person == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This concept describe a person");
          cpb.presentationByName();
          props_Person = cpb.create();
        }
        return props_Person;
      case LanguageConceptSwitch.Room:
        if (props_Room == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("This concept describes the room that can be found in a floor");
          cpb.presentationByName();
          props_Room = cpb.create();
        }
        return props_Room;
      case LanguageConceptSwitch.University:
        if (props_University == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("The component describe the university (root element)");
          cpb.presentationByName();
          props_University = cpb.create();
        }
        return props_University;
    }
    return null;
  }
}
